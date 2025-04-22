package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融资方放款结果通知
 *
 * @author auto create
 * @since 1.0, 2021-04-27 14:38:07
 */
public class MybankCreditSceneprodDrawdownConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6366116932262811273L;

	/**
	 * 网商针对一次客户主动申请生成的申请单据编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 证件主体名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 支用详情列表
	 */
	@ApiListField("drawdown_list")
	@ApiField("scene_drawdown_detail")
	private List<SceneDrawdownDetail> drawdownList;

	/**
	 * 错误原因 ，成功可以不填
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 资方生成的申请单号
	 */
	@ApiField("fin_order_no")
	private String finOrderNo;

	/**
	 * 放款结果，成功：Y，失败：N
	 */
	@ApiField("process_result")
	private String processResult;

	/**
	 * 放款通知备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 标识一次业务交互, 网商的ipRoleId+"_"YYYYMMDD+35位流水号, 最后2，3位要求是数字。
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public List<SceneDrawdownDetail> getDrawdownList() {
		return this.drawdownList;
	}
	public void setDrawdownList(List<SceneDrawdownDetail> drawdownList) {
		this.drawdownList = drawdownList;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getFinOrderNo() {
		return this.finOrderNo;
	}
	public void setFinOrderNo(String finOrderNo) {
		this.finOrderNo = finOrderNo;
	}

	public String getProcessResult() {
		return this.processResult;
	}
	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
