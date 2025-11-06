package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融银行直投业务放款申请
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:29
 */
public class MybankCreditSceneprodDrawdownApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7299269599195223995L;

	/**
	 * 客户姓名
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 网商业务订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部网商端不重复
	 */
	@ApiField("mybk_order_no")
	private String mybkOrderNo;

	/**
	 * 操作类型： APPLY： 放款申请 ， RETRY： 修改信息后重试支付
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扩展参数，JSON格式，5000个字符以内
	 */
	@ApiField("out_param")
	private String outParam;

	/**
	 * 外部请求流水号,32个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_seq_no")
	private String outSeqNo;

	/**
	 * 支付信息明细
	 */
	@ApiListField("payment_detail_list")
	@ApiField("scene_prod_payment_account_info")
	private List<SceneProdPaymentAccountInfo> paymentDetailList;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，该字段内容与site的内容相关
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMybkOrderNo() {
		return this.mybkOrderNo;
	}
	public void setMybkOrderNo(String mybkOrderNo) {
		this.mybkOrderNo = mybkOrderNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutParam() {
		return this.outParam;
	}
	public void setOutParam(String outParam) {
		this.outParam = outParam;
	}

	public String getOutSeqNo() {
		return this.outSeqNo;
	}
	public void setOutSeqNo(String outSeqNo) {
		this.outSeqNo = outSeqNo;
	}

	public List<SceneProdPaymentAccountInfo> getPaymentDetailList() {
		return this.paymentDetailList;
	}
	public void setPaymentDetailList(List<SceneProdPaymentAccountInfo> paymentDetailList) {
		this.paymentDetailList = paymentDetailList;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
