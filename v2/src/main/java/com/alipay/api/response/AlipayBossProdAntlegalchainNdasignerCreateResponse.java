package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ImportSignerInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.ndasigner.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-18 15:03:34
 */
public class AlipayBossProdAntlegalchainNdasignerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7858832256513961752L;

	/** 
	 * 失败的记录集合,只记录创建失败或通知失败的记录
	 */
	@ApiListField("import_signer_info_list")
	@ApiField("import_signer_info")
	private List<ImportSignerInfo> importSignerInfoList;

	public void setImportSignerInfoList(List<ImportSignerInfo> importSignerInfoList) {
		this.importSignerInfoList = importSignerInfoList;
	}
	public List<ImportSignerInfo> getImportSignerInfoList( ) {
		return this.importSignerInfoList;
	}

}
