package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class CustomerWithPlatformUsersResponse extends AlipayObject {

	private static final long serialVersionUID = 6828598621522952476L;

	/**
	 * 归属于bd的海图客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 归属于bd的海图客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 客户id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 官网uid
	 */
	@ApiField("passport_id")
	private String passportId;

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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
