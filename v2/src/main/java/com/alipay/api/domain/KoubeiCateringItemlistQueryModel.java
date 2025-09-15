package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐饮行业商品列表查询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-25 19:15:14
 */
public class KoubeiCateringItemlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1416616363676957622L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 查询特定状态的商品。状态枚举值为：INIT表示未上架，EFFECTIVE表示已上架，PAUSE表示已暂停, FREEZE表示已冻结, INVALID表示已下架。如果为空则默认查询所有状态商品
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 操作人员身份类型。如果是isv代操作，请传入ISV；如果是商户操作请传入MERCHANT；如果是商户员工则传入M_STAFF
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 页码数，整数，表示需要查询第几页数据。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 列表每页显示商品的条目数，整数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
