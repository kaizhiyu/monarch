/*
 * Copyright (c) 2017 Ampool, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. See accompanying LICENSE file.
 */
package io.ampool.monarch.table.coprocessor.internal;

import io.ampool.monarch.table.coprocessor.MCoprocessor;
import io.ampool.monarch.table.coprocessor.MTableObserver;

import java.util.ArrayList;
import java.util.List;

public class CoprocessorContainer {
  private List<MTableObserver> observersList = null;
  private List<MCoprocessor> endpointsList = null;

  public CoprocessorContainer() {
    observersList = new ArrayList<>();
    endpointsList = new ArrayList<>();
  }

  public void addObserver(MTableObserver observer) {
    this.observersList.add(observer);
  }

  public void addObserver(List<MTableObserver> observers) {
    this.observersList.addAll(observers);
  }

  public void addCoprocessor(MCoprocessor endpointCP) {
    this.endpointsList.add(endpointCP);
  }

  public void addCoprocessor(List<MCoprocessor> endpointCPs) {
    this.endpointsList.addAll(endpointCPs);
  }

  public List<MTableObserver> getObservers() {
    return this.observersList;
  }

  public List<MCoprocessor> getCoprocessors() {
    return this.endpointsList;
  }

}