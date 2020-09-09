data class UserBean(var idUser: Int?,var pseudo: String,var password: String?)

data class MessageBean(var idMessage: Int?, var user: UserBean?,var password: String?,var date:Int?, var content:String?)

data class Errors(var message: String)