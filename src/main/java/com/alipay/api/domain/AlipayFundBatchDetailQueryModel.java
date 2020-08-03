package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发明细统一查询接口
 *
 * @author auto create
 * @since 1.0, 2019-12-23 17:44:36
 */
public class AlipayFundBatchDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3118522626158686546L;

	/**
	 * 11～32位的数字或字母或数字与字母的组合，且区分大小写。（注：只有境外代发使用，其他场景请使用out_batch_no）
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批量代发到支付宝账户：BATCH_TRANS_ACC
批量代发到银行账户：BATCH_TRANS_BC
（注：只有境外代发使用，其他场景请使用product_code）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 批量代发业务场景。如：
GLOBAL: 全球代发. 除CNY的多币种代发或人民币跨境代发。
LOCAL：中国境内纯人民币代发。
MESSAGE_BATCH_PAY：接口报文代发。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 批次文件中明细流水号（注：只有境外代发使用，其他场景请使用out_biz_no）
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 境外代发明细状态：
INIT：支付宝只对上传的文件做了记录，还没有处理。
APPLIED：支付宝已完成兑换，等待发起付汇。
DEALED：已发起付汇申请，等待付汇结果。
SUCCESS	处理成功：付汇成功。
FAIL	处理失败：明细信息错误导致明细校验失败或者付汇失败。
DISUSE 已废弃：明细被支付宝系统废弃。

其他场景明细状态：
SUCCESS：成功
FAIL:失败
DEALING：处理中
WAIT_PAY：等待付款
	 */
	@ApiField("detail_status")
	private String detailStatus;

	/**
	 * 商户的批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 商户明细订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 采用分页查询，本参数为空或0默认显示第一页。（境外代发场景下，每页最大500条记录，不足500条则按实际记录数返回，不需要商户输入每页的记录数。如果输入的值大于总页数，则支付宝返回最后一页数据。
例如：按条件查询到600条数据，则分成2页显示。输入2或大于2的整数都会返回100条数据；不输入任何数据则默认返回第一页，其他场景下，每页大小请输入page_sign字段）。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，不传的情况下默认500条，超过500条默认按500条查询；不足500条则按实际记录数返回
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 收款方账号。对于批量代发到支付宝账户场景，填写钱包账号。对于批量代发到银行账户场景，填写银行卡号。
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 业务产品码。不同产品值不同，具体值联系支付宝确认。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约主体，即签约了批量代发产品的支付宝账号。
注：境外代发场景下必须传入
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDetailNo() {
		return this.detailNo;
	}
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public String getDetailStatus() {
		return this.detailStatus;
	}
	public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSignPrincipal() {
		return this.signPrincipal;
	}
	public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

}
