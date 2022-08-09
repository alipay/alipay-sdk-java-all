package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景素材内容schema
 *
 * @author auto create
 * @since 1.0, 2021-07-16 19:24:01
 */
public class PromoContentApiSchemaVO extends AlipayObject {

	private static final long serialVersionUID = 5461198211284164752L;

	/**
	 * 内容的配置示意图
	 */
	@ApiField("demo_pic")
	private String demoPic;

	/**
	 * 内容的元数据ID
	 */
	@ApiField("schema_id")
	private String schemaId;

	/**
	 * xml格式的schema；这里规定了场景素材需要的字段，字段的类型以及字段的规则要求。
场景素材中的图片字段，要求上传的是这个图片在文件存储平台的标识即图片文件ID（详见接口alipay.open.app.service.image.upload）
	 */
	@ApiField("schema_xml")
	private String schemaXml;

	public String getDemoPic() {
		return this.demoPic;
	}
	public void setDemoPic(String demoPic) {
		this.demoPic = demoPic;
	}

	public String getSchemaId() {
		return this.schemaId;
	}
	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public String getSchemaXml() {
		return this.schemaXml;
	}
	public void setSchemaXml(String schemaXml) {
		this.schemaXml = schemaXml;
	}

}
