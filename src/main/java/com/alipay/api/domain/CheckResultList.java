package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试节点执行结果
 *
 * @author auto create
 * @since 1.0, 2019-11-27 19:27:02
 */
public class CheckResultList extends AlipayObject {

	private static final long serialVersionUID = 3649254841291324986L;

	/**
	 * 执行动作id，口碑侧提供
	 */
	@ApiField("action_id")
	private String actionId;

	/**
	 * 枚举类型
RECEIPT: 接单；
REJECT: 拒单；
RECEIPT_TIMEOUT: 商家超时未接单
POS_ADD_DISH: POS线下加菜
POS_DELETE_DISH: POS线下减菜
POS_PAY: POS线下支付
POS_ADD_DISCOUNT: POS线下添加优惠
POS_SYNC: POS同步订单信息
POS_OPEN: POS开台
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 校验是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getActionId() {
		return this.actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
