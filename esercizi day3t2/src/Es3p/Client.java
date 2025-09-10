package Es3p;

public class Client {


    public class Client {
        //attributi
        private int clientId;
        private String name;
        private String surname;
        private String email;
        private String subDate;


        //costruttori

        public Client(int clientId, String name, String surname, String email, String subDate) {
            this.clientId = clientId;
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.subDate = subDate;
        }

        @Override
        public String toString() {
            return "Client card= {" +
                    "clientId=" + clientId +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", subDate='" + subDate + '\'' +
                    '}';
        }

        //metodi
    }

}
