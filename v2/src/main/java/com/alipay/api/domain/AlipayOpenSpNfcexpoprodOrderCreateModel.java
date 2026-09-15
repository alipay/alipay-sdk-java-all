package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线圈订单创建接口
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:12:51
 */
public class AlipayOpenSpNfcexpoprodOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7836319515796683232L;

	/**
	 * 订单的描述文案，长度不要超过256个字符
	 */
	@ApiField("order_desc")
	private String orderDesc;

	/**
	 * 业务自行生成的唯一值，用于幂等校验
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 下单物料的生产资料信息
	 */
	@ApiField("production_material")
	private ProductionMaterial productionMaterial;

	/**
	 * 下单物料数量（个）
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 用户收货地址
	 */
	@ApiField("shipping_address")
	private NcoilopenAddressInfo shippingAddress;

	/**
	 * 标识订单所属的解决方案，用于业务归类和路由
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 标识订单所属的子解决方案，用于更细粒度的业务归类
	 */
	@ApiField("sub_solution_id")
	private String subSolutionId;

	/**
	 * 模板编码，对应
商品的模板唯一标识，用于确定下单的商品类型和规格
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getOrderDesc() {
		return this.orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ProductionMaterial getProductionMaterial() {
		return this.productionMaterial;
	}
	public void setProductionMaterial(ProductionMaterial productionMaterial) {
		this.productionMaterial = productionMaterial;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public NcoilopenAddressInfo getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(NcoilopenAddressInfo shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSubSolutionId() {
		return this.subSolutionId;
	}
	public void setSubSolutionId(String subSolutionId) {
		this.subSolutionId = subSolutionId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
