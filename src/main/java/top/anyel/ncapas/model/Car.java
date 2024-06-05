package top.anyel.ncapas.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
public class Car {
    @NotBlank
    private String model;
    @NotBlank
    private int year;
    @NotBlank
    private Date startDate;
    @NotBlank
    private Date endDate;

}
