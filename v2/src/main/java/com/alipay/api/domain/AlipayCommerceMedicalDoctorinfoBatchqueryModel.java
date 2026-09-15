package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医生信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:07:48
 */
public class AlipayCommerceMedicalDoctorinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4512549521999637292L;

	/**
	 * null
	 */
	@ApiListField("doctorid_list")
	@ApiField("string")
	private List<String> doctoridList;

	public List<String> getDoctoridList() {
		return this.doctoridList;
	}
	public void setDoctoridList(List<String> doctoridList) {
		this.doctoridList = doctoridList;
	}

}
