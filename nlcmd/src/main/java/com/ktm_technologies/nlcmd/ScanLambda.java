/*
 * Copyright 2019 Robert Staudinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ktm_technologies.nlcmd;

import java.util.HashMap;
import java.util.List;

/**
 * Interface for action callbacks that also provide detailed match information such as
 * sub-matches and placeholder content.
 */
public interface ScanLambda {

    /**
     * Hook to run when a certain action should be dispatched.
     *
     * @param matches Map of sub-phrase matches and average probabilities
     * @param placeholders Map of matches placeholders and their actual input
     */
    void run(HashMap<List<String>, Double> matches,
             HashMap<String, List<String>> placeholders);
}
