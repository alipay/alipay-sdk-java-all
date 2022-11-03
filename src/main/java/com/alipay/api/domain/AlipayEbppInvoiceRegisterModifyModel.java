package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回传入驻工单状态变更
 *
 * @author auto create
 * @since 1.0, 2020-04-13 09:53:27
 */
public class AlipayEbppInvoiceRegisterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1722285654948482931L;

	/**
	 * 事件，可选值：
create: 创建工单,
isp_audit: 系统/小二审核通过,
isv_agree: 服务商接单,
isv_reject: 服务商驳回工单,
device_deploy: 税控设备上架部署完成,
confirm_qualification: 商户确认获取电子发票资质,
fill_delivery_address: 商家填写税控设备收获地址,
confirm_published: 服务商回传发行完毕,
user_send_device: 商家确认已发出税控设备,
machine_room_received: 服务商确认已收到税控设备,
refund_start: 发起退款,
refund_agree: 服务商拒绝退款,
refund_reject: 服务商拒绝退单,
test_start: 开始测试开票,
test_success: 开票结果回传：开票成功,
test_fail: 开票结果回传：开票失败,
confirm_test_success: 确认测试开票成功
	 */
	@ApiField("action")
	private String action;

	/**
	 * 拓展字段，
当 action = confirm_test_success (确认测试开票成功)。拓展字段必填，税控服务生效时间：tax_start_time；税控服务时效时间：tax_end_time；入驻工单类型：register_type（可选值：新订购：new，续订：renew，已有税控初始化：init）
当 action = test_fail, 拓展字段必填, message节点中返回失败原因
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 入驻工单ID, 幂等ID
	 */
	@ApiField("register_id")
	private String registerId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

}
