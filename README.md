** The tutorial focuses on how to integration spring security into ldap for authentication 

sudo apt install ldap-utils
sudo apt install net-tools

ldapsearch -x -H ldap://{ip-addres}:389 -D "cn=admin,dc=xl,dc=com" -w "password" -b "dc=xl,dc=com" -s sub "objectclass=admin"
