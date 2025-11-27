package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔资料地址
 *
 * @author auto create
 * @since 1.0, 2025-09-28 19:35:53
 */
public class ClaimAttachmentUrlVo extends AlipayObject {

	private static final long serialVersionUID = 3814951326697829692L;

	/**
	 * 该参数是同学提交理赔时的病历信息，需要同步给供应商，用户理赔报案使用。
	 */
	@ApiListField("anamnesis")
	@ApiField("string")
	private List<String> anamnesis;

	/**
	 * 该参数是同学在提交理赔时上传的证件资料，需要同步给供应商报案使用。
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	/**
	 * 该参数是同学在提交理赔时，生成的理赔材料图片，需要同步给供应商进行报案使用。
	 */
	@ApiListField("invoice")
	@ApiField("string")
	private List<String> invoice;

	public List<String> getAnamnesis() {
		return this.anamnesis;
	}
	public void setAnamnesis(List<String> anamnesis) {
		this.anamnesis = anamnesis;
	}

	public List<String> getIds() {
		return this.ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public List<String> getInvoice() {
		return this.invoice;
	}
	public void setInvoice(List<String> invoice) {
		this.invoice = invoice;
	}

}
