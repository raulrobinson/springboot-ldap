package com.samaddico.springboot.ldap.service;

//@Service
public class PersonRepository {

    /*private static final Integer THREE_SECONDS = 3000;

    @Autowired
    private LdapTemplate ldapTemplate;

    public List<Person> getPersonNamesByLastName(String lastName) {

        LdapQuery query = query()
                .searchScope(SearchScope.SUBTREE)
                .timeLimit(THREE_SECONDS)
                .countLimit(10)
                .attributes("cn")
                .base(LdapUtils.emptyLdapName())
                .where("objectclass").is("person")
                .and("sn").not().is(lastName)
                //.and("sn").like("j*hn")
                .and("uid").isPresent();

        return ldapTemplate.search(query, new PersonAttributesMapper());
    }*/

    /*private class PersonAttributesMapper implements AttributesMapper<Person> {
        public Person mapFromAttributes(Attributes attrs) throws NamingException {
            Person person = new Person();
            person.setFullName((String)attrs.get("cn").get());

            Attribute sn = attrs.get("sn");
            if (sn != null){
                person.setLastName((String)sn.get());
            }
            return person;
        }
    }*/
}
