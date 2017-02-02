/*
 *
 *   Copyright 2017 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.springframework.data.mybatis.samples.security;

import org.springframework.data.mybatis.annotations.Column;
import org.springframework.data.mybatis.annotations.JdbcType;
import org.springframework.data.mybatis.annotations.MappedSuperclass;
import org.springframework.data.mybatis.domains.LongId;

import javax.validation.constraints.NotNull;

import static org.apache.ibatis.type.JdbcType.VARCHAR;

/**
 * Created by dka on 1/13/17.
 */
@MappedSuperclass
public abstract class SiteAccess extends LongId {

	@JdbcType(VARCHAR)
	@Column(name = "NAME")
	@NotNull
	private String name;

	protected SiteAccess() {
	}

	public SiteAccess(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
