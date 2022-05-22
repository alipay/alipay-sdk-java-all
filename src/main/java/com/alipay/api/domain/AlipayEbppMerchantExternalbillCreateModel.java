package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账单上传
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:29:31
 */
public class AlipayEbppMerchantExternalbillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6467269362523946277L;

	/**
	 * 账期金额,单位元
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账期描述
	 */
	@ApiField("bill_date_desc")
	private String billDateDesc;

	/**
	 * 账期结束时间
	 */
	@ApiField("bill_date_end")
	private Date billDateEnd;

	/**
	 * 账期起始时间
	 */
	@ApiField("bill_date_start")
	private Date billDateStart;

	/**
	 * 主业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 账单过期时间, 可为空, 默认2099年
	 */
	@ApiField("expiry_date")
	private Date expiryDate;

	/**
	 * PROPERTY_MNG/物业费，
PROPERTY_WATER/代收水费，
PROPERTY_ELECTRIC/代收电费，
PROPERTY_SHARE/公共维护金，
PROPERTY_PARK_MNG/车位管理费，
PROPERTY_PARK_LEASE /车位租赁费，
PROPERTY_ROOM_LEASE/房屋租赁费，
PROPERTY_TEMP_PARK/临时停车费，
PROPERTY_PUBLIC_ENERGY/公共能耗费，
PROPERTY_GAS/代收燃气费，
PROPERTY_MAINTENANCE/维修服务费，
PROPERTY_HOUSEKEEPING/家政服务费，
PROPERTY_GREENING/绿化服务费，
PROPERTY_STORAGE_ROOM/储藏室物业费，
PROPERTY_DECORATION_DEPOSIT/装修押金，
PROPERTY_REFUSE_COLLECTION/垃圾清运费，
PROPERTY_PAID_SERVICE/有偿服务费，
PROPERTY_WATER_SHARING/水费公摊费，
PROPERTY_ELECTRIC_SHARING/电费公摊费,
PROPERTY_DECORATION_MANAGEMENT/装修管理费,
PROPERTY_HEATING_FEE/代收取暖费。
	 */
	@ApiField("fee_type")
	private String feeType;

	/**
	 * 滞纳金, 单位元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 滞纳金产生时间, 空代表不会出现滞纳金
	 */
	@ApiField("fine_date")
	private Date fineDate;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 缴费商户短码
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	/**
	 * 缴费实体ID
	 */
	@ApiField("object_id")
	private String objectId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 账单生效时间, 空默认当前时间
	 */
	@ApiField("release_date")
	private Date releaseDate;

	/**
	 * 该账单是否用户可选 ，1 可选 0不可选，默认不可选
	 */
	@ApiField("select_optional")
	private String selectOptional;

	/**
	 * 账单排列顺序
	 */
	@ApiField("sequence")
	private Long sequence;

	/**
	 * 服务费, 单位元
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 账单总金额,单位 元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillDateDesc() {
		return this.billDateDesc;
	}
	public void setBillDateDesc(String billDateDesc) {
		this.billDateDesc = billDateDesc;
	}

	public Date getBillDateEnd() {
		return this.billDateEnd;
	}
	public void setBillDateEnd(Date billDateEnd) {
		this.billDateEnd = billDateEnd;
	}

	public Date getBillDateStart() {
		return this.billDateStart;
	}
	public void setBillDateStart(Date billDateStart) {
		this.billDateStart = billDateStart;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFeeType() {
		return this.feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getFineAmount() {
		return this.fineAmount;
	}
	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Date getFineDate() {
		return this.fineDate;
	}
	public void setFineDate(Date fineDate) {
		this.fineDate = fineDate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSelectOptional() {
		return this.selectOptional;
	}
	public void setSelectOptional(String selectOptional) {
		this.selectOptional = selectOptional;
	}

	public Long getSequence() {
		return this.sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
