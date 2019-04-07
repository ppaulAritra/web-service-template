package com.cexpress.adminpanel.oauth;

import java.util.Calendar;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.cexpress.adminpanel.component.ApiError;



@Repository
/*@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)*/
public class SettingsRepository {

    private String accessToken;
    
    private String refreshToken;

    private String name;
    private String password;
    private String userId;
    private String companyid;
    private Calendar expiresIn;
    private String roleid;
    private String rolename;
    private String department;
    private String notificationcount;
    private String isFirstLoggedin;
    private ApiError apierror;
    
    public String getIsFirstLoggedin() {
		return isFirstLoggedin;
	}

	public void setIsFirstLoggedin(String isFirstLoggedin) {
		this.isFirstLoggedin = isFirstLoggedin;
	}

	public String getNotificationcount() {
		return notificationcount;
	}

	public void setNotificationcount(String notificationcount) {
		this.notificationcount = notificationcount;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
    
    public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Calendar getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Calendar expiresIn) {
        this.expiresIn = expiresIn;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public ApiError getApierror() {
		return apierror;
	}

	public void setApierror(ApiError apierror) {
		this.apierror = apierror;
	}

	@Override
	public String toString() {
		return "SettingsRepository [accessToken=" + accessToken + ", refreshToken=" + refreshToken + ", name=" + name
				+ ", password=" + password + ", userId=" + userId + ", companyid=" + companyid + ", expiresIn="
				+ expiresIn + ", roleid=" + roleid + ", rolename=" + rolename + ", department=" + department
				+ ", notificationcount=" + notificationcount + ", isFirstLoggedin=" + isFirstLoggedin + ", apierror="
				+ apierror + "]";
	}
    

}
