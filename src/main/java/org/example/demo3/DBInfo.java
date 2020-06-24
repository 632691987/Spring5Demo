package org.example.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DBInfo
{
    private String userName;

    private String password;

    private String url;

    private String driverCLass;
}
