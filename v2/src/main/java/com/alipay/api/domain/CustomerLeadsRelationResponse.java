package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-12 15:47:41
 */
public class CustomerLeadsRelationResponse extends AlipayObject {

	private static final long serialVersionUID = 7677112467179957224L;

	/**
	 * 海图客户归属BD花名
	 */
	@ApiField("bd_nick_name")
	private String bdNickName;

	/**
	 * 海图客户归属BD工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 客户唯一实体id
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 海图客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 海图客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 客户常用名
	 */
	@ApiField("customer_short_name")
	private String customerShortName;

	/**
	 * 海图客户归属BD所属团队名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 海图客户归属BD所属团队编码
	 */
	@ApiField("dept_no")
	private String deptNo;

	/**
	 * 客户id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 关联商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 官网uid
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * null
	 */
	@ApiListField("passport_id_list")
	@ApiField("string")
	private List<String> passportIdList;

	/**
	 * 渠道uid
	 */
	@ApiField("platform_uid")
	private String platformUid;

	public String getBdNickName() {
		return this.bdNickName;
	}
	public void setBdNickName(String bdNickName) {
		this.bdNickName = bdNickName;
	}

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerShortName() {
		return this.customerShortName;
	}
	public void setCustomerShortName(String customerShortName) {
		this.customerShortName = customerShortName;
	}

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return this.deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public List<String> getPassportIdList() {
		return this.passportIdList;
	}
	public void setPassportIdList(List<String> passportIdList) {
		this.passportIdList = passportIdList;
	}

	public String getPlatformUid() {
		return this.platformUid;
	}
	public void setPlatformUid(String platformUid) {
		this.platformUid = platformUid;
	}

}
