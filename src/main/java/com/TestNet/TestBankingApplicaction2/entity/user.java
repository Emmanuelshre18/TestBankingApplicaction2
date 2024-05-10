/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TestNet.TestBankingApplicaction2.entity;

/**
 *
 * @author DELL PC
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author DELL PC
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "users")
public class user {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    
    private String Firstname;
    
    private String Lastname;    
    
    private String OtherName;
    
    private String Gender;
    
    private String Address;
    
    private String StateOfOrigin;
    
    private String AccountNumber;
    
    private BigDecimal AccountBallance;
    
    private String email;
    
    private String PhoneNumber;
    
    private String AlternativePhoneNumber;
    
    private String Status;
    
    @CreationTimestamp
    private LocalDateTime CreatedAt;
    
    @UpdateTimestamp
    private LocalDateTime ModifiedAt;
    
}

