package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建支付宝素材
 *
 * @author auto create
 * @since 1.0, 2022-07-18 20:36:48
 */
public class AlipayMarketingMaterialCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6726659829161973895L;

	/**
	 * 素材字段列表，素材提报的具体内容，包含三种类型：图片、文本、链接。图片类型，则根据“图片资源上传接口（https://opendocs.alipay.com/pre-open/02bhlj）”中返回的resource_id字段值进行素材字段的设值。文本或链接类型，则按照实际需要设值即可，需满足具体的规范要求。规范要求详情请参见产品文档。
	 */
	@ApiListField("material_fields")
	@ApiField("material_field")
	private List<MaterialField> materialFields;

	/**
	 * 素材名称，接入方自行生成，建议命名时遵循一定的规律以方便管理。
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 素材规范ID，用于标识具体场景下的素材规范，根据具体的使用场景获取对应的素材规范ID。
	 */
	@ApiField("material_spec_id")
	private String materialSpecId;

	/**
	 * 外部业务单号，用作幂等控制，相同单号会返回上一次的结果，接入方需保证单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<MaterialField> getMaterialFields() {
		return this.materialFields;
	}
	public void setMaterialFields(List<MaterialField> materialFields) {
		this.materialFields = materialFields;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialSpecId() {
		return this.materialSpecId;
	}
	public void setMaterialSpecId(String materialSpecId) {
		this.materialSpecId = materialSpecId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
