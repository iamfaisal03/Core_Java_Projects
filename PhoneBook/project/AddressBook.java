package project;

import java.util.List;

public class AddressBook {
	
	Trie<Contact> contacts;
	
	
	public AddressBook() {
		contacts=new Trie<>();
	}
	
	public void addContact(Contact contact) throws Exception{
		if (contacts.search(contact.getName().isEmpty())) {
				contacts.insert(contact.getName(),contact);
		}else {
			throw new Exception();
			
		}
	}
	public void deleteContact(String name)throws Exception{
		List<Contact> contact=contacts.search(name);
		if (!contact.isEmpty()) {
			contacts.delete(name, contact.get(0));
			
		}else {
			throw new Exception();
			
		}
	}
	
}
