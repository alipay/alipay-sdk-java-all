package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销券明细
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:45:01
 */
public class VoucherInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 7139561624951722677L;

	/**
	 * ISTORE拿铁满50减10券
	 */
	@ApiField("description")
	private String description;

	/**
	 * 失效时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 券ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 券状态。VALID：有效，表示可用；INVALID：无效，由于过期等券自身原因导致的不可用；UNAVAILABLE：条件未满足导致的不可用，比如用户指定使用，但是因为条件未达到，比如金额、商品等。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 生效时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time")
	private Date validTime;

	/**
	 * 券值，根据券类型而定，比如满减：10，折扣：0.9(九折)
	 */
	@ApiField("value")
	private String value;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getValidTime() {
		return this.validTime;
	}
	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
