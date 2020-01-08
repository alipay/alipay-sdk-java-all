package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生产单对象实体
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:58:29
 */
public class AccessProduceOrder extends AlipayObject {

	private static final long serialVersionUID = 5497431562971325312L;

	/**
	 * 口碑码批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 生产单标识
	 */
	@ApiField("produce_order_id")
	private String produceOrderId;

	/**
	 * 生产数量
	 */
	@ApiField("produce_quantity")
	private Long produceQuantity;

	/**
	 * 物料属性名称
	 */
	@ApiField("stuff_attr_name")
	private String stuffAttrName;

	/**
	 * 物料材质
	 */
	@ApiField("stuff_material")
	private String stuffMaterial;

	/**
	 * 物料尺寸
	 */
	@ApiField("stuff_size")
	private String stuffSize;

	/**
	 * 物料类型
	 */
	@ApiField("stuff_type")
	private String stuffType;

	/**
	 * 模板唯一标识
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getProduceOrderId() {
		return this.produceOrderId;
	}
	public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
	}

	public Long getProduceQuantity() {
		return this.produceQuantity;
	}
	public void setProduceQuantity(Long produceQuantity) {
		this.produceQuantity = produceQuantity;
	}

	public String getStuffAttrName() {
		return this.stuffAttrName;
	}
	public void setStuffAttrName(String stuffAttrName) {
		this.stuffAttrName = stuffAttrName;
	}

	public String getStuffMaterial() {
		return this.stuffMaterial;
	}
	public void setStuffMaterial(String stuffMaterial) {
		this.stuffMaterial = stuffMaterial;
	}

	public String getStuffSize() {
		return this.stuffSize;
	}
	public void setStuffSize(String stuffSize) {
		this.stuffSize = stuffSize;
	}

	public String getStuffType() {
		return this.stuffType;
	}
	public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
