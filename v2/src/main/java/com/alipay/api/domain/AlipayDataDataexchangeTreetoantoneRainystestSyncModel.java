package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * tree模型的msgTo测试接口01
 *
 * @author auto create
 * @since 1.0, 2025-08-20 10:28:48
 */
public class AlipayDataDataexchangeTreetoantoneRainystestSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1135316178649427295L;

	/**
	 * 描述
	 */
	@ApiField("demo_boolean")
	private Boolean demoBoolean;

	/**
	 * 描述 当前字段已废弃(the test data;Dont care it ;)
	 */
	@ApiField("demo_date")
	@Deprecated
	private Date demoDate;

	/**
	 * 描述
	 */
	@ApiField("demo_num")
	private Long demoNum;

	/**
	 * 测试数据
	 */
	@ApiField("demo_price")
	private String demoPrice;

	/**
	 * 啊巴巴
	 */
	@ApiField("demo_ref_copy")
	private RainyComplexTypesRefWeakFirst demoRefCopy;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("demo_ref_fieldcopy")
	private RainyComplexTypesRefWeakFirst demoRefFieldcopy;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiListField("deno_ref")
	@ApiField("rainy_complex_types_the_fourth")
	private List<RainyComplexTypesTheFourth> denoRef;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getDemoBoolean() {
		return this.demoBoolean;
	}
	public void setDemoBoolean(Boolean demoBoolean) {
		this.demoBoolean = demoBoolean;
	}

	public Date getDemoDate() {
		return this.demoDate;
	}
	public void setDemoDate(Date demoDate) {
		this.demoDate = demoDate;
	}

	public Long getDemoNum() {
		return this.demoNum;
	}
	public void setDemoNum(Long demoNum) {
		this.demoNum = demoNum;
	}

	public String getDemoPrice() {
		return this.demoPrice;
	}
	public void setDemoPrice(String demoPrice) {
		this.demoPrice = demoPrice;
	}

	public RainyComplexTypesRefWeakFirst getDemoRefCopy() {
		return this.demoRefCopy;
	}
	public void setDemoRefCopy(RainyComplexTypesRefWeakFirst demoRefCopy) {
		this.demoRefCopy = demoRefCopy;
	}

	public RainyComplexTypesRefWeakFirst getDemoRefFieldcopy() {
		return this.demoRefFieldcopy;
	}
	public void setDemoRefFieldcopy(RainyComplexTypesRefWeakFirst demoRefFieldcopy) {
		this.demoRefFieldcopy = demoRefFieldcopy;
	}

	public List<RainyComplexTypesTheFourth> getDenoRef() {
		return this.denoRef;
	}
	public void setDenoRef(List<RainyComplexTypesTheFourth> denoRef) {
		this.denoRef = denoRef;
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

}
