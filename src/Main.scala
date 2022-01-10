import java.util.jar.Attributes.Name

object Main {

  def main(args: Array[String]): Unit = {
    val est1= new Estudiante(1,"pepe perez", "1234")
    val est2= new Estudiante(2,"javi jerez", "1234")
    val admin1= new Administrador(3, 1)
    val admin2=new Administrador(4,2)
    val inv= new Invitado(5, 10)

    val userList: List[Usuario] = List(est1, est2, admin1, admin2, inv)
    println("******************************** \n")

    for(n<- userList)
      respuesta(n)

    println("\n********************************")

    def respuesta(usuario: Usuario) = usuario match {
      case i: Invitado =>
        println("No estás autorizado a entrar en esta lección")
      case a: Administrador =>
        nivelAdmin(a)
      case e: Estudiante =>
        login(e)
    }

    def login(estudiante: Estudiante): Unit ={
      var nombre = estudiante.name
      var contrase = estudiante.password
      if (userList.contains(estudiante)){
        println(s"Bienvenid@ a OpenBootcamp, $nombre")
      }
    }
    def nivelAdmin(administrador: Administrador): Unit ={
      if (administrador.level == 1){
        println("Tu nivel es insuficiente")
      }
      else if(administrador.level>1){
        println("Tu nivel es el correcto")
      }
    }
  }


  }

