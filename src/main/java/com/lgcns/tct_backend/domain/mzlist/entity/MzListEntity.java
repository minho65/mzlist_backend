package com.lgcns.tct_backend.domain.mzlist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "TB_MZ_LIST")
@Entity
public class MzListEntity {

    @Id
    @Column(name = "list_id")
    private String listId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "list_name")
    private String listName;

    @Column(name = "created_date")
    private String createdDate;

}
