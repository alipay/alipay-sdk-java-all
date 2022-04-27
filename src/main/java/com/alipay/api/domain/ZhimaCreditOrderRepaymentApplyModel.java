package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用订单追赔操作申请接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 15:30:52
 */
public class ZhimaCreditOrderRepaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7155736489254437959L;

	/**
	 * 追赔操作类型，目前支持：
CREATE --  创建
COMPLETE -- 完结
CANCEL -- 取消
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 业务类目，由芝麻分类，商户根据自己业务选择使用；
action_type 为 CREATE 时该值不可为空；
	 */
	@ApiField("category")
	private String category;

	/**
	 * Json 字符串，订单对应业务信息同步，会影响订单C端展现；
如有特殊诉求，接入前找业务对口人对接
	 */
	@ApiField("order_info")
	private String orderInfo;

	/**
	 * 用作业务幂等号，唯一标识一笔商户单据
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 追赔金额; 
精度支持小数点后2位（金额：分）
当action_type 为 CREATE时，必填；
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 追赔相关证明信息
	 */
	@ApiField("repay_proof")
	private String repayProof;

	/**
	 * 蚂蚁统一会员ID，确保传入与业务订单相匹配的会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayProof() {
		return this.repayProof;
	}
	public void setRepayProof(String repayProof) {
		this.repayProof = repayProof;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
