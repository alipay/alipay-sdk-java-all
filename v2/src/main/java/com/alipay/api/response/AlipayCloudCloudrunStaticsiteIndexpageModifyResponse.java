package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.indexpage.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 11:26:46
 */
public class AlipayCloudCloudrunStaticsiteIndexpageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1768674523499851617L;

	/** 
	 * 本次变更成功的域名列表
	 */
	@ApiListField("domain_list")
	@ApiField("string")
	private List<String> domainList;

	/** 
	 * 索引文件名
	 */
	@ApiField("index_file")
	private String indexFile;

	public void setDomainList(List<String> domainList) {
		this.domainList = domainList;
	}
	public List<String> getDomainList( ) {
		return this.domainList;
	}

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}
	public String getIndexFile( ) {
		return this.indexFile;
	}

}
