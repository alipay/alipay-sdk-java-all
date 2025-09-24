package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WelfareAuthExtResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.welfare.supplierauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 19:12:25
 */
public class AlipayDigitalmgmtWelfareSupplierauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1244287999912317657L;

	/** 
	 * 该参数作为家属出生日期，通过家空间小程序绑定家属中获取到，主要用于供应商为家属开通权益的必填字段之一。
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 该参数用来标识进入供应商系统的用户标志，是登录供应商应用后解析来的，蚂蚁侧将此参数作为用户标志
	 */
	@ApiField("emp_unique_id")
	private String empUniqueId;

	/** 
	 * 该参数作为用户权益扩展信息，根据供应商请求的场景查询不同用户权益归属信息
	 */
	@ApiField("ext_info")
	private WelfareAuthExtResp extInfo;

	/** 
	 * 该参数用来标识进入供应商系统的家属标志，是登录供应商应用后解析来的，蚂蚁会将此参数作为家属标志之一
	 */
	@ApiField("family_sid")
	private String familySid;

	/** 
	 * 该参数作为家属性别，通过家空间小程序绑定家属中获取到，主要用于供应商为家属开通权益的必填字段之一。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 该字段用来判断用户是否有权益查看蚂蚁套餐内容，是根据用户查询授权信息，若有授权，则具有权益，返回true，反之返回false。供应商会依据此参数，判断页面中是否展示蚂蚁套餐内容。
	 */
	@ApiField("has_auth")
	private Boolean hasAuth;

	/** 
	 * 该参数作为家属手机号，通过家空间小程序绑定家属中获取到，主要用于供应商为家属开通权益的身份信息验证。
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 该参数作为家属姓名，通过家空间小程序绑定家属中获取到，主要用于供应商为家属开通权益的必填字段之一。
	 */
	@ApiField("name")
	private String name;

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setEmpUniqueId(String empUniqueId) {
		this.empUniqueId = empUniqueId;
	}
	public String getEmpUniqueId( ) {
		return this.empUniqueId;
	}

	public void setExtInfo(WelfareAuthExtResp extInfo) {
		this.extInfo = extInfo;
	}
	public WelfareAuthExtResp getExtInfo( ) {
		return this.extInfo;
	}

	public void setFamilySid(String familySid) {
		this.familySid = familySid;
	}
	public String getFamilySid( ) {
		return this.familySid;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setHasAuth(Boolean hasAuth) {
		this.hasAuth = hasAuth;
	}
	public Boolean getHasAuth( ) {
		return this.hasAuth;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
