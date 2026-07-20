package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约绑定申请明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class SignApplyBizDetail extends AlipayObject {

	private static final long serialVersionUID = 1265272216671113715L;

	/**
	 * 回跳地址
	 */
	@ApiField("back_addr")
	private String backAddr;

	/**
	 * 用户模式
	 */
	@ApiField("custtype")
	private String custtype;

	/**
	 * 冻结金额，单位：CNY
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 套餐ID
	 */
	@ApiField("pack_id")
	private String packId;

	/**
	 * 套餐名称
	 */
	@ApiField("pack_name")
	private String packName;

	/**
	 * 套餐价格，单位：CNY
	 */
	@ApiField("pack_price")
	private String packPrice;

	/**
	 * 商品金额，单位：CNY
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 用户所在省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 分期期数
	 */
	@ApiField("repayments")
	private Long repayments;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("social_credit_code")
	private String socialCreditCode;

	/**
	 * 门店地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBackAddr() {
		return this.backAddr;
	}
	public void setBackAddr(String backAddr) {
		this.backAddr = backAddr;
	}

	public String getCusttype() {
		return this.custtype;
	}
	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPackId() {
		return this.packId;
	}
	public void setPackId(String packId) {
		this.packId = packId;
	}

	public String getPackName() {
		return this.packName;
	}
	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getPackPrice() {
		return this.packPrice;
	}
	public void setPackPrice(String packPrice) {
		this.packPrice = packPrice;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public Long getRepayments() {
		return this.repayments;
	}
	public void setRepayments(Long repayments) {
		this.repayments = repayments;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSocialCreditCode() {
		return this.socialCreditCode;
	}
	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
