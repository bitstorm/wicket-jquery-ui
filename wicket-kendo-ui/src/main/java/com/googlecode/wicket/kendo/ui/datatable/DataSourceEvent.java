/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.kendo.ui.datatable;

import org.apache.wicket.ajax.json.JSONObject;

import com.googlecode.wicket.jquery.core.JQueryEvent;
import com.googlecode.wicket.jquery.core.utils.RequestCycleUtils;
import com.googlecode.wicket.kendo.ui.KendoDataSource;

/**
 * Provides a base class for {@link KendoDataSource} event objects
 * 
 * @author Sebastien Briquet - sebfz1
 */
public class DataSourceEvent extends JQueryEvent
{
	private final JSONObject object;

	public DataSourceEvent()
	{
		String data = RequestCycleUtils.getQueryParameterValue("data").toString("{}");
		this.object = new JSONObject(data);
	}

	public JSONObject getObject()
	{
		return this.object;
	}

	/**
	 * Provides an event object that will be broadcasted by the {@link DataSourceAjaxBehavior} 'create' callback
	 */
	public static class CreateEvent extends DataSourceEvent
	{
	}

	/**
	 * Provides an event object that will be broadcasted by the {@link DataSourceAjaxBehavior} 'update' callback
	 */
	public static class UpdateEvent extends DataSourceEvent
	{
	}

	/**
	 * Provides an event object that will be broadcasted by the {@link DataSourceAjaxBehavior} 'delete' callback
	 */
	public static class DeleteEvent extends DataSourceEvent
	{
	}
}
