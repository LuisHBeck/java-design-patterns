package org.beck.builder.solution.animal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Data annotation provides:
 * getter, setter, toString, equalsAndHashCode
 * & RequiredArgsConstructor
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // create teh builder
public class Animal {

    private String name;
    private String owner;
    private String race;
}
