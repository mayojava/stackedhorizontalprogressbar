/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.stackedhorizontalprogressbarproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import github.nisrulz.stackedhorizontalprogressbar.StackedHorizontalProgressBar;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int primary_pts = 3;
    int secondary_pts = 6;
    int max = 10;

    StackedHorizontalProgressBar stackedHorizontalProgressBar;
    stackedHorizontalProgressBar =
        (StackedHorizontalProgressBar) findViewById(R.id.stackedhorizontalprogressbar);
    stackedHorizontalProgressBar.setMax(max);
    stackedHorizontalProgressBar.setProgress(primary_pts);
    stackedHorizontalProgressBar.setSecondaryProgress(secondary_pts);
  }
}
