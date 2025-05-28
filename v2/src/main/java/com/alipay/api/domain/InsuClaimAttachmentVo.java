package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔提交的图片对象
 *
 * @author auto create
 * @since 1.0, 2023-05-18 13:16:35
 */
public class InsuClaimAttachmentVo extends AlipayObject {

	private static final long serialVersionUID = 4433249112291167921L;

	/**
	 * anamnesis+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("anamnesis")
	@ApiField("string")
	private List<String> anamnesis;

	/**
	 * ids+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	/**
	 * invoice+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
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
