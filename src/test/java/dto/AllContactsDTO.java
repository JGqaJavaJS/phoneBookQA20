package dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AllContactsDTO {
    ContactDto[] contacts;

//    public AllContactsDTO() {
//    }
//
//    public AllContactsDTO(ContactDto[] contacts) {
//        this.contacts = contacts;
//    }
//
//    public ContactDto[] getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(ContactDto[] contacts) {
//        this.contacts = contacts;
//    }
}
