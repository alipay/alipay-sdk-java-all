package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员电子证件信息保存
 *
 * @author auto create
 * @since 1.0, 2022-11-01 11:02:05
 */
public class AlipayUserCertdocSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7827659243493686933L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IDENTITY_CARD:身份证;
DRIVING_LICENSE:驾驶证;
VEHICLE_LICENSE:行驶证;
SOCIAL_SECURITY_CARD:社会保障卡;
PASSPORT:护照;
DEGREE_CERTIFICATE:学位证;
HK_MACAU_LAISSEZ_PASSER:港澳通行证;
PROPRETY_OWNERSHIP_CERTIFICATE:房产证;
REAL_ESTATE_WARRANTS:不动产证;
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证件其余信息,以json string形式传入。具体每一个k/v规则参照具体证件规则。举例驾驶证extInfo规则：
字段名字(key):drivingLicenseNo,字段含义:证号,字段类型:STRING,是否可空:否;
字段名字(key):sex,字段含义:性别,字段类型:STRING,是否可空:是,值非空时约束:选择,具体约束:男,女,;
字段名字(key):nationality,字段含义:国籍,字段类型:STRING,是否可空:是;
字段名字(key):address,字段含义:住址,字段类型:STRING,是否可空:是;
字段名字(key):dateOfBirth,字段含义:出生日期,字段类型:DATE,是否可空:是;
字段名字(key):dateOfFirstIssue,字段含义:初次领证日期,字段类型:DATE,是否可空:是;
字段名字(key):clazz,字段含义:准驾车型,字段类型:STRING,是否可空:是,值非空时约束:正则表达式,具体约束:^[a-z_A-Z_0-9]*$;
字段名字(key):fileNo,字段含义:档案编号,字段类型:STRING,是否可空:是,值非空时约束:正则表达式,具体约束:^[0-9]{12}$;
字段名字(key):issuingAuthority,字段含义:签发机关,字段类型:STRING,是否可空:是;
字段名字(key):valideDate,字段含义:生效日期,字段类型:DATE,是否可空:是,值非空时约束:正则表达式,具体约束:^\d{4}-\d{2}-\d{2}$;
字段名字(key):expireDate,字段含义:失效日期,字段类型:DATE,是否可空:是,值非空时约束:正则表达式,具体约束:^\d{4}-\d{2}-\d{2}$;
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 证件主体用户姓名。证件类型+证件号+证件姓名需要唯一。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 含义：支付宝用户的openId，是用户（user_id）在应用（AppId）下的唯一用户标识（新接入的ISV必传open_id，不传user_id）。网关会将传入的open_id字段的值转换为user_id（2088格式），并放入与之映射的原user_id字段，并移除open_id参数，业务系统获取到的参数仅有user_id。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 证件图片集合
	 */
	@ApiListField("pic_list")
	@ApiField("open_cert_pic")
	private List<OpenCertPic> picList;

	/**
	 * 证件状态，T或者空代表正常，F代表删除。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<OpenCertPic> getPicList() {
		return this.picList;
	}
	public void setPicList(List<OpenCertPic> picList) {
		this.picList = picList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
