# spring-roo-example
Spring Roo is an open-source software tool that uses convention-over-configuration principles to provide rapid application development of Java-based enterprise software


mkdir hello
cd hello
roo.sh
roo> project setup --topLevelPackage com.foo
roo> jpa setup --provider HIBERNATE --database HYPERSONIC_IN_MEMORY
roo> entity jpa --class ~.domain.Timer
roo> field string --fieldName message --notNull
roo> repository jpa --all
roo> service --all
roo> web mvc setup
roo> web mvc view setup --type THYMELEAF
roo> web mvc controller --all --responseType THYMELEAF
roo> web mvc controller --all --pathPrefix /api
roo> quit
mvn spring-boot:run

