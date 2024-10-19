import lombok.Value;
import java.util.Arrays;
import java.util.List;

public class Main {

   private static final FilterChain chain = new FilterChain();

   public static void main(String[] args) {
      chain.doFilter(new Request("GET", "https://colruyt.int", "/v0/products/cola", true));
      chain.doFilter(new Request("POST", "https://colruyt.int", "/v0/products/cola", true));
      chain.doFilter(new Request("PATCH", "https://colruyt.int", "/v0/products/cola", true));
      chain.doFilter(new Request("OPTIONS", "https://colruyt.int", "/v0/products/cola", true));
      chain.doFilter(new Request("get", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("post", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("patch", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("options", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("GET", "https://google.com", "/v1/searches/5", true));
      chain.doFilter(new Request("POST", "https://google.com", "/v1/searches/5", true));
      chain.doFilter(new Request("PATCH", "https://google.com", "/v1/searches/5", true));
      chain.doFilter(new Request("OPTIONS", "https://google.com", "/v1/seаrches/5", true));
      chain.doFilter(new Request("GET", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("POST", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("PATCH", "https://colruytgroup.com", "/v0/products/cola", true));
      chain.doFilter(new Request("OPTIONS", "https://colruytgroup.com", "/v0/products/cola", true));
   }
}

@Value
class Request {
   String method;
   String url;
   String resource;
   boolean authenticated;
}
interface Filter {
   void doFilter(Request request);
}

class FilterChain implements Filter {

   private static final List<Filter> filters = Arrays.asList(new AuthenticationFilter(), new HttpsFilter(), new MethodFilter(), new ResourceFilter());

   @Override
   public void doFilter(final Request request) {
      filters.forEach(filter -> filter.doFilter(request));
   }
}

class AuthenticationFilter implements Filter{
   @Override
   public void doFilter(final Request request) {
      if (!request.isAuthenticated()) {
         throw new RuntimeException("Not authenticated");
      }
   }
}

class HttpsFilter implements Filter {
   @Override
   public void doFilter(final Request request) {
      if (!request.getUrl().startsWith("https://")) {
         throw new RuntimeException("Must use https!");
      }
   }
}

class MethodFilter implements Filter{
   @Override
   public void doFilter(final Request request) {
      if (!Arrays.asList("POST", "GET", "PATCH", "OPTIONS").contains(request.getMethod().toUpperCase())) {
         throw new RuntimeException("Method not supported");
      }
   }
}

class ResourceFilter implements Filter{
   @Override
   public void doFilter(final Request request) {
      if (!request.getResource().matches("^\\/v([0-9])\\/[a-zA-Z]+\\/[a-z0-9A-Z]+$")) {
         throw new RuntimeException("Not found");
      }
   }
}


