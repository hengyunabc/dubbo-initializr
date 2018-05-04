package {{dubboPackageName}};

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;


@Service(
        version = "{{dubboServiceVersion}}"
//        ,
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
)
public class {{serviceSimpleName}}Impl implements {{serviceSimpleName}} {

    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}