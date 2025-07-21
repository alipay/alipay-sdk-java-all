package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单详细信息
 *
 * @author auto create
 * @since 1.0, 2021-06-21 16:17:51
 */
public class ExternalBillInfoResult extends AlipayObject {

	private static final long serialVersionUID = 2427644385267488787L;

	/**
	 * 账单id
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

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
	 * 账单过期时间
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
PROPERTY_ELECTRIC_SHARING/电费公摊费。
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
	 * 账单生效时间
	 */
	@ApiField("release_date")
	private Date releaseDate;

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
	 * INIT("待缴")
WAIT_PAY("处理中"),
FINISH_PAY("已缴"),
FAIL("支付失败"),
REFUND("异常退款"),
INVALID("失效"),
CHANNEL_FINISH_PAY ("外部渠道支付");
	 */
	@ApiField("status")
	private String status;

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

	public String getAlipayBillId() {
		return this.alipayBillId;
	}
	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
