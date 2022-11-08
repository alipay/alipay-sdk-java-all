package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工作证职业数据回流接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 17:09:22
 */
public class ZhimaCustomerJobworthJobdataAddModel extends AlipayObject {

	private static final long serialVersionUID = 8834822598673584235L;

	/**
	 * 身份证证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 关联key，受理台返回
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 回传信息
	 */
	@ApiListField("job_data_list")
	@ApiField("job_worth_jobdata")
	private List<JobWorthJobdata> jobDataList;

	/**
	 * 支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户中文名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getConnKey() {
		return this.connKey;
	}
	public void setConnKey(String connKey) {
		this.connKey = connKey;
	}

	public List<JobWorthJobdata> getJobDataList() {
		return this.jobDataList;
	}
	public void setJobDataList(List<JobWorthJobdata> jobDataList) {
		this.jobDataList = jobDataList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
