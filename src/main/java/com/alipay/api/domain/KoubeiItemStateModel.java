package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品操作接口
 *
 * @author auto create
 * @since 1.0, 2017-06-06 11:40:36
 */
public class KoubeiItemStateModel extends AlipayObject {

	private static final long serialVersionUID = 5219316219985855718L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，有效期24小时；
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作上下文 ISV角色操作时必填；其他角色不需填写
	 */
	@ApiField("operation_context")
	private KoubeiOperationContext operationContext;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 控制商品的售卖状态，RESUME：恢复售卖；PAUSE：暂停售卖,C端不可见;
	 */
	@ApiField("state_type")
	private String stateType;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public KoubeiOperationContext getOperationContext() {
		return this.operationContext;
	}
	public void setOperationContext(KoubeiOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStateType() {
		return this.stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

}
