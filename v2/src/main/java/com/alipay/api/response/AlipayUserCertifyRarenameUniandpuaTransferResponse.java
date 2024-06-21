package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RareNameEncodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.uniandpua.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:43
 */
public class AlipayUserCertifyRarenameUniandpuaTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7657975913335331277L;

	/** 
	 * 多于一字两码时，返回其他的编码。返回不包括ret_name和入参中的姓名。
	 */
	@ApiListField("other_names")
	@ApiField("rare_name_encode_info")
	private List<RareNameEncodeInfo> otherNames;

	/** 
	 * 转码后的姓名
	 */
	@ApiField("ret_name")
	private String retName;

	public void setOtherNames(List<RareNameEncodeInfo> otherNames) {
		this.otherNames = otherNames;
	}
	public List<RareNameEncodeInfo> getOtherNames( ) {
		return this.otherNames;
	}

	public void setRetName(String retName) {
		this.retName = retName;
	}
	public String getRetName( ) {
		return this.retName;
	}

}
