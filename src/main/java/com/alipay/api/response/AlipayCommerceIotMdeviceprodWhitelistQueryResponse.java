package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.whitelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-23 21:34:13
 */
public class AlipayCommerceIotMdeviceprodWhitelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4755434882889822788L;

	/** 
	 * 白名单所属应用的appID
	 */
	@ApiField("app_project_id")
	private String appProjectId;

	/** 
	 * 白名单所属应用的状态。
OPEN：开启；CLOSE：关闭；
	 */
	@ApiField("app_white_list_status")
	private String appWhiteListStatus;

	/** 
	 * 白名单开始生效时间。不指定时表示有记录则生效。
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/** 
	 * 白名单过期时间。不指定时表示有记录则永不过期。
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 白名单的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 白名单记录创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 白名单记录更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 白名单分组类型。 BIZ_TYPE：表示已IoT业务类型划分的用户白名单； URL：表示已URL划分的用户白名单； SERVICE_ID：表示已接口ID划分的用户白名单；
	 */
	@ApiField("group_type")
	private String groupType;

	/** 
	 * 白名单分组值，与白名单分组类型相关。 白名单分组类型为IoT业务类型时，白名单分组值为对应的某个具体的业务类型； 白名单分组类型为URL时，白名单分组值为对应的具体的URL字符串； 白名单分组类型为服务ID时，白名单分组值为对应的具体的某个服务的ID；
	 */
	@ApiField("group_value")
	private String groupValue;

	/** 
	 * 白名单的文本备注信息
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 用户标识类型,表示用户ID的类型。 ALIPAY_USER: 支付宝PID;
	 */
	@ApiField("user_identify_type")
	private String userIdentifyType;

	/** 
	 * 用于标识值，与user_identify_type相关，user_identify_type为ALIPAY_USER时，该值表示用户PID。
	 */
	@ApiField("user_identify_value")
	private String userIdentifyValue;

	public void setAppProjectId(String appProjectId) {
		this.appProjectId = appProjectId;
	}
	public String getAppProjectId( ) {
		return this.appProjectId;
	}

	public void setAppWhiteListStatus(String appWhiteListStatus) {
		this.appWhiteListStatus = appWhiteListStatus;
	}
	public String getAppWhiteListStatus( ) {
		return this.appWhiteListStatus;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	public Date getEffectiveTime( ) {
		return this.effectiveTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getGroupType( ) {
		return this.groupType;
	}

	public void setGroupValue(String groupValue) {
		this.groupValue = groupValue;
	}
	public String getGroupValue( ) {
		return this.groupValue;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setUserIdentifyType(String userIdentifyType) {
		this.userIdentifyType = userIdentifyType;
	}
	public String getUserIdentifyType( ) {
		return this.userIdentifyType;
	}

	public void setUserIdentifyValue(String userIdentifyValue) {
		this.userIdentifyValue = userIdentifyValue;
	}
	public String getUserIdentifyValue( ) {
		return this.userIdentifyValue;
	}

}
