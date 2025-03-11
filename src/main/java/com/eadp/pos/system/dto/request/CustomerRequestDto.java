package com.eadp.pos.system.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequestDto {
    private String name;
    private String address;
    private double salary;

    @Override
    public String toString() {
        return "CustomerRequestDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
