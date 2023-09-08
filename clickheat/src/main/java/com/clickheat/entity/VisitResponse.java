package com.clickheat.entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class VisitResponse {
    public final Date date;
    public final int count;

}
