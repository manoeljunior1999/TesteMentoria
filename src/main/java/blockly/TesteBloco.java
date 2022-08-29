package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class TesteBloco {

public static final int TIMEOUT = 300;

/**
 *
 * Descreva esta função...
 *
 * @param email
 * @param isMobile
 *
 * @author Manoel Luis Souza De Oliveira Júnior
 * @since 26/08/2022 16:07:16
 *
 */
public static Var Exemplo1(@ParamMetaData(description = "email", id = "53fc1de9") Var email, @ParamMetaData(description = "isMobile", id = "b11110b2") Var isMobile) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var Teste = Var.VAR_NULL;
   private Var json = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf("Teste 1");
    Teste =
    Var.valueOf("Teste 2");
    json =
    cronapi.json.Operations.createObjectJson();
    cronapi.json.Operations.setJsonOrMapField(json,
    Var.valueOf("a"),
    Var.valueOf("a"));
    json =
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.TesteBloco:Exemplo2"), Var.valueOf("4be0c214", item), Var.valueOf("6ec5d19d", json));
    return json;
   }
 }.call();
}

/**
 *
 * @param x
 * @param x0
 *
 * @author Manoel Luis Souza De Oliveira Júnior
 * @since 26/08/2022 16:07:16
 *
 */
public static Var Exemplo2(@ParamMetaData(description = "x", id = "4be0c214") Var x, @ParamMetaData(description = "x0", id = "6ec5d19d") Var x0) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf("abc").getObjectAsString());
    item =
    cronapi.json.Operations.createObjectJson();
    cronapi.json.Operations.setJsonOrMapField(x0,
    Var.valueOf("teste"),
    Var.valueOf("abcd"));
    return x0;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @param username
 * @param email
 * @param password
 *
 * @author Manoel Luis Souza De Oliveira Júnior
 * @since 26/08/2022 16:07:16
 *
 */
public static Var signUp(@ParamMetaData(description = "username", id = "b7d52451") Var username, @ParamMetaData(description = "email", id = "36bc1157") Var email, @ParamMetaData(description = "password", id = "097625e0") Var password) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var x0 = Var.VAR_NULL;
   private Var Teste = Var.VAR_NULL;
   private Var json = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.defaultSignUp(
cronapi.map.Operations.createObjectMapWith(Var.valueOf("username",username) , Var.valueOf("name",username) , Var.valueOf("email",email) , Var.valueOf("password",password)));
   }
 }.call();
}

}

