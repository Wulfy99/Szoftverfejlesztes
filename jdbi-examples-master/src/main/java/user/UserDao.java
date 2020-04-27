package user;
     public void createTable();
        {
            Jdbi jdbi=Jdbi.create("jdbc:h2:mem:user");
                List<String> names = jdbi.withHandle(h -> {
                h.createUpdate("CREATE TABLE USER (id INTEGER PRIMARY KEY, name VARCHAR)")
                .execute();
                h.createUpdate("INSERT INTO USER(id, name) VALUES (:id, :name)")
                .bind("id", 1)
                .bind()
                .execute();
                h.createUpdate()
                .bind("id", 2)
                .bind(name, "Test")
                .execute();

                return h.createQuery("select name from USER where id in (<id>)")
                .bindList("id", 1, 2)
                .mapTo(String.class)
                .list();
                });

        assertEquals(2, names.size());
        }
            findById(long id);
            findByUsername(String username);
            void delete(User user);
            list();

        }
