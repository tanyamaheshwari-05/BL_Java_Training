package Builder;

public class User {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setEmail("tanya123@gmail.com")
                .setName("Tanya")
                .setUserId("TAN123")
                .createUser();
        System.out.println(user);
    }

    private String name;
    private String userId;
    private String email;

    private User(Builder builder) {
        // initialise
        this.name = builder.name;
        this.email = builder.email;
        this.userId = builder.userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " : " + this.userId + " : " + this.email;
    }

    static class Builder {
        private String name;
        private String userId;
        private String email;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User createUser() {
            User user = new User(this);
            return user;
        }
    }
}
